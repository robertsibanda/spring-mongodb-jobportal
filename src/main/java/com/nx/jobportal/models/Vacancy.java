package com.nx.jobportal.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;

@Document(collection="vacancy")
@Data
public class Vacancy {
  
    @Id
    private String jobid;

    @Field("jobTitle")
    //private String vOrganisation;
    private String jobTitle;
    private String jobDescription;
    private String jobRequirements;
    private String jobQualifications;

    
}
