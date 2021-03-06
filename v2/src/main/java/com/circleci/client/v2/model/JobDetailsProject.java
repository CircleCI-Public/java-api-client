/*
 * CircleCI API
 * This describes the resources that make up the CircleCI API v2.
 *
 * The version of the OpenAPI document: v2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.circleci.client.v2.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Information about a project.
 */
@ApiModel(description = "Information about a project.")

public class JobDetailsProject {
  public static final String JSON_PROPERTY_SLUG = "slug";
  @JsonProperty(JSON_PROPERTY_SLUG)
  private String slug;

  public static final String JSON_PROPERTY_NAME = "name";
  @JsonProperty(JSON_PROPERTY_NAME)
  private String name;

  public static final String JSON_PROPERTY_EXTERNAL_URL = "external_url";
  @JsonProperty(JSON_PROPERTY_EXTERNAL_URL)
  private String externalUrl;

  public JobDetailsProject slug(String slug) {
    this.slug = slug;
    return this;
  }

   /**
   * Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped.
   * @return slug
  **/
  @ApiModelProperty(example = "gh/CircleCI-Public/api-preview-docs", required = true, value = "Project slug in the form `vcs-slug/org-name/repo-name`. The `/` characters may be URL-escaped.")
  public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) {
    this.slug = slug;
  }

  public JobDetailsProject name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the project
   * @return name
  **/
  @ApiModelProperty(example = "api-preview-docs", required = true, value = "The name of the project")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public JobDetailsProject externalUrl(String externalUrl) {
    this.externalUrl = externalUrl;
    return this;
  }

   /**
   * URL to the repository hosting the project&#39;s code
   * @return externalUrl
  **/
  @ApiModelProperty(example = "https://github.com/CircleCI-Public/api-preview-docs", required = true, value = "URL to the repository hosting the project's code")
  public String getExternalUrl() {
    return externalUrl;
  }

  public void setExternalUrl(String externalUrl) {
    this.externalUrl = externalUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobDetailsProject jobDetailsProject = (JobDetailsProject) o;
    return Objects.equals(this.slug, jobDetailsProject.slug) &&
        Objects.equals(this.name, jobDetailsProject.name) &&
        Objects.equals(this.externalUrl, jobDetailsProject.externalUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(slug, name, externalUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobDetailsProject {\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    externalUrl: ").append(toIndentedString(externalUrl)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

