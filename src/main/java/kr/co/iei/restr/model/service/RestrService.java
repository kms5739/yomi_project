package kr.co.iei.restr.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.iei.restr.model.dao.RestrDao;
import kr.co.iei.restr.model.dto.Restaurant;

@Service
public class RestrService {

	@Autowired
	private RestrDao restrDao;
	
	public Restaurant selectOneRestr(int restrNo) {
		Restaurant r = restrDao.selectOneRestr(restrNo);
		return r;
	}

}
