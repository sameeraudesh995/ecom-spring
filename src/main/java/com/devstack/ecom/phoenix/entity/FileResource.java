package com.devstack.ecom.phoenix.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.sql.Blob;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FileResource {

    @Column(name="file_name", columnDefinition = "LONGBLOB")
    private Blob fileName;
    @Column(name="hash")
    private Blob hash;
    @Column(name="directory")
    private Blob directory;
    @Column(name="resource_url")
    private Blob resource_url;

}
