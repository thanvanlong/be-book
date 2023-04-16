package com.longtv.btlon1.service.mail;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@Service
@AllArgsConstructor
public class EmailSender implements EmailService {
    private final JavaMailSender mailSender;
    @Override
    @Async
    public void send(String to, String content) {
        try{
            MimeMessage message = mailSender.createMimeMessage();
            MimeMessageHelper mimeMessageHelper =
                    new MimeMessageHelper(message,"utf-8");
            mimeMessageHelper.setText("" +
                    "<div style=\"font-family: Helvetica,Arial,sans-serif;min-width:1000px;overflow:auto;line-height:2\">\n" +
                    "        <div style=\"margin:50px auto;width:70%;padding:20px 0\">\n" +
                    "          <div style=\"border-bottom:1px solid #eee\">\n" +
                    "            <a href=\"\" style=\"font-size:1.4em;color: #00466a;text-decoration:none;font-weight:600\">Team 69</a>\n" +
                    "          </div>\n" +
                    "          <p style=\"font-size:1.1em\">Hi,</p>\n" +
                    "          <p>Thank you for choosing out store. Use the following new password to login. Please change password after logging</p>\n" +
                    "          <h2 style=\"background: #00466a;margin: 0 auto;width: max-content;padding: 0 10px;color: #fff;border-radius: 4px;\">"+ content + "</h2>\n" +
                    "          <p style=\"font-size:0.9em;\">Regards,<br />Team 69</p>\n" +
                    "          <hr style=\"border:none;border-top:1px solid #eee\" />\n" +
                    "          <div style=\"float:right;padding:8px 0;color:#aaa;font-size:0.8em;line-height:1;font-weight:300\">\n" +
                    "            <p>Team 69 Inc</p>\n" +
                    "            <p>Tran Duy Hung, Hanoi, Vietnam</p>\n" +
                    "            <p>Vietnam</p>\n" +
                    "          </div>\n" +
                    "        </div>\n" +
                    "      </div>",true);
            mimeMessageHelper.setTo(to);
            mimeMessageHelper.setSubject("New passowrd");
            mimeMessageHelper.setFrom("longthan366@gmail.com");
            mailSender.send(message);
        }catch(MessagingException e){
            throw new IllegalStateException("Fail to send email");
        }
    }
}