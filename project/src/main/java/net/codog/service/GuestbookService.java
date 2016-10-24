package net.codog.service;

import java.util.List;

import net.codog.dao.GuestBookMapper;
import net.codog.domain.Guestbook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
* @author 王文涵 
* @date 2016年10月24日
* <p>Description:guestbook的service层，负责留言板功能 </p>
 */
@Service
public class GuestbookService {
    
	@Autowired
	GuestBookMapper guestBookMapper;
	
	List<Guestbook> getAllGuestbook(Integer start,Integer end){
		return guestBookMapper.selectAll("guestbook", start, end);
	}
	
	int getGuestbookCount(){
		return guestBookMapper.selectCount();
	}
}
