package com.spring.ghost.model;

import java.io.Serializable;
import java.util.Date;

public class Images implements Serializable {
    private Integer id;

    private String imageName;

    private String imageTag;

    private String gitBranch;

    private String gitMessage;

    private String host;

    private String port;

    private String codeRegistry;

    private String pullAddress;

    private Date createdAt;

    private Date updatedAt;

    private String command;

    private String dockerfile;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getImageTag() {
        return imageTag;
    }

    public void setImageTag(String imageTag) {
        this.imageTag = imageTag;
    }

    public String getGitBranch() {
        return gitBranch;
    }

    public void setGitBranch(String gitBranch) {
        this.gitBranch = gitBranch;
    }

    public String getGitMessage() {
        return gitMessage;
    }

    public void setGitMessage(String gitMessage) {
        this.gitMessage = gitMessage;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getCodeRegistry() {
        return codeRegistry;
    }

    public void setCodeRegistry(String codeRegistry) {
        this.codeRegistry = codeRegistry;
    }

    public String getPullAddress() {
        return pullAddress;
    }

    public void setPullAddress(String pullAddress) {
        this.pullAddress = pullAddress;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public String getDockerfile() {
        return dockerfile;
    }

    public void setDockerfile(String dockerfile) {
        this.dockerfile = dockerfile;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", imageName=").append(imageName);
        sb.append(", imageTag=").append(imageTag);
        sb.append(", gitBranch=").append(gitBranch);
        sb.append(", gitMessage=").append(gitMessage);
        sb.append(", host=").append(host);
        sb.append(", port=").append(port);
        sb.append(", codeRegistry=").append(codeRegistry);
        sb.append(", pullAddress=").append(pullAddress);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", command=").append(command);
        sb.append(", dockerfile=").append(dockerfile);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}