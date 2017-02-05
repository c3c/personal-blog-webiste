package net.codog.web;

import lombok.extern.slf4j.Slf4j;
import net.codog.vo.ResponseVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/email")
@Slf4j
public class EmailController {

	@Autowired
	private MailSender mailSender;
	
	@RequestMapping(value = "/sendmail", method = RequestMethod.POST)
	public ResponseVO<String> sendMail(@RequestParam("title")String title,@RequestParam("content")String content){
		log.info("title is " + title + "content is " + content);
		SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
		simpleMailMessage.setSubject(title);
		simpleMailMessage.setText(content);
		simpleMailMessage.setFrom("1633675284@qq.com");
		simpleMailMessage.setTo("1633675284@qq.com");
		try{
			mailSender.send(simpleMailMessage);
		}catch(Exception e){
			return new ResponseVO<String>(false, e.getMessage(), "");
		}
		return new ResponseVO<String>(true, "", "");
	}
}
