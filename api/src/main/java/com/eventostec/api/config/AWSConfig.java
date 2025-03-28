package com.eventostec.api.config;


import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AWSConfig {
    @Value("${aws.region}")
    private String awsRegion;
    //ver o minuto 47 pois vou ter que entrar na conta aws
    //vou ter que criar um IAM algo do tipo para poder fazer funfar
    @Bean
    public AmazonS3 createS3Isntance(){
        return AmazonS3ClientBuilder.standard()
                .withRegion(awsRegion)
                .build();
    }
}
