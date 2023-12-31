package edu.ssafy.ourtrip.place.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.ssafy.ourtrip.list.service.ListService;
import edu.ssafy.ourtrip.place.dto.PlaceDto;
import edu.ssafy.ourtrip.place.service.PlaceService;

@RestController
@RequestMapping("/place")
public class PlaceController {
	private PlaceService placeService;

	public PlaceController(PlaceService placeService) {
		super();
		this.placeService = placeService;
	}
	
	@PostMapping("/register")
	public ResponseEntity<?> registerPlace(@RequestBody List<PlaceDto> places){
		Map<String, Object> resultMap = new HashMap<String, Object>();
		HttpStatus status = HttpStatus.ACCEPTED;
		
		try {
			placeService.registerPlace(places);
			status = HttpStatus.OK;
			return new ResponseEntity<Void>(HttpStatus.CREATED);
		} catch (Exception e) {
			resultMap.put("message", e.getMessage());
			status = HttpStatus.INTERNAL_SERVER_ERROR;
			return new ResponseEntity<Map<String, Object>>(resultMap, status);
		}
	}
	
	@DeleteMapping("/delete/{listNo}")
	public ResponseEntity<String> deletePlacesByListNo(@PathVariable("listNo") int listNo) throws Exception {
		placeService.deletePlacesByListNo(listNo);
		return ResponseEntity.ok().build();
	}
}
