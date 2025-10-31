package com.expense.authservice.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.query.sql.internal.ParameterRecognizerImpl;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class JwtResponseDTO {
    private String accessToken;

    private String token;
}
