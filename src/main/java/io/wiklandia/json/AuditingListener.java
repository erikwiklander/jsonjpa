package io.wiklandia.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.PostPersist;

@Slf4j
@Component
public class AuditingListener {

    @Async
    @PostPersist
    @SneakyThrows
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void postPersist(Object entity) {

        AuditLog auditLog = new AuditLog();
        auditLog.setClassName(Information.class.getName());

        auditLog.setData(new ObjectMapper().writeValueAsString(entity));

        AuditLogRepository auditLogRepository = BeanUtil.getBean(AuditLogRepository.class);

        auditLogRepository.save(auditLog);

    }
}
