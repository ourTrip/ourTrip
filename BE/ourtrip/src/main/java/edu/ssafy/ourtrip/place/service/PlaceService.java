package edu.ssafy.ourtrip.place.service;

import java.sql.SQLException;

import edu.ssafy.ourtrip.place.dto.PlaceDto;

public interface PlaceService {
	void registerPlace(PlaceDto placeDto) throws SQLException;
}
