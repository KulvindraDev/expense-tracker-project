package com.expense.userservice.deserializer;

import com.expense.userservice.models.UserInfoDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.common.serialization.Deserializer;

import java.util.Map;

public class UserInfoDeserializer implements Deserializer<UserInfoDTO> {
    @Override
    public void configure(Map<String, ?> configs, boolean isKey) {
    }

    @Override
    public UserInfoDTO deserialize (String arg0, byte[] arg1) {
        ObjectMapper mapper = new ObjectMapper();
        UserInfoDTO user = null;
        try {
            user = mapper.readValue(arg1, UserInfoDTO.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public void close() {
    }
}
