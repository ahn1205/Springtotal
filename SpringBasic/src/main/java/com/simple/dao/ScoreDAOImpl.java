package com.simple.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;


import com.simple.command.ScoreVO;

@Repository("scoreDAOImpl")
public class ScoreDAOImpl implements ScoreDAO {

	private List<ScoreVO> DB = new ArrayList<>();
	
	@Override
	public void scoreRegist(ScoreVO vo) {
		DB.add(vo);
		System.out.println(DB.toString());
	}

	@Override
	public List<ScoreVO> scoreList() {		
		return DB;
	}

	@Override
	public boolean scoreDelete(int num) {
		DB.remove(num);			
		return true;
	}

}
