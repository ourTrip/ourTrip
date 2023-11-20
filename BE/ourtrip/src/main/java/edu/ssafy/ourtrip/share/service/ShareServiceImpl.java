package edu.ssafy.ourtrip.share.service;

import java.sql.SQLException;

import org.springframework.stereotype.Service;

import edu.ssafy.ourtrip.share.dao.ShareMapper;
import edu.ssafy.ourtrip.share.dto.ShareDto;

@Service
public class ShareServiceImpl implements ShareService {
	
	private ShareMapper shareMapper;
	
	public ShareServiceImpl(ShareMapper shareMapper) {
		this.shareMapper = shareMapper;
	}

	@Override
	public void add(ShareDto shareDto) throws SQLException {
		shareMapper.add(shareDto);		
	}

	@Override
	public int find(ShareDto shareDto) throws SQLException {
		return shareMapper.find(shareDto);
	}

}
