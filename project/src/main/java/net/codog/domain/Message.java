package net.codog.domain;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
/**
* @author 王文涵 
* @date 2016年10月20日
* <p>Description: message的实体类，通知用户的消息表,个性化的通知用户的时候用到</p>
 */
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Setter
@Getter
public class Message {
	//自增id
    private Integer messageId;
    //消息题目
    private String messageTitie;
    //消息内容
    private String messageContent;
    //发布时间
    private Date messageSendTime;
    //消息是否阅读,0代表未读,1代表读,默认为0
    private Integer messageIsRead;
    //用户id
    private Integer userBasicInformationId;
}