package com.integracao.msintegracao.dto;

import com.integracao.msintegracao.enums.StatusEmail;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class Email {
    private UUID emailId;
    private String ownerRef;
    private String emailFrom;
    private String emailTo;
    private String subject;
    private String text;
    private LocalDateTime sendDateEmail;
    private StatusEmail statusEmail;
}
