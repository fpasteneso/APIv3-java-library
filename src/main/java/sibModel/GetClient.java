/*
 * SendinBlue API
 * SendinBlue provide a RESTFul API that can be used with any languages. With this API, you will be able to :   - Manage your campaigns and get the statistics   - Manage your contacts   - Send transactional Emails and SMS   - and much more...  You can download our wrappers at https://github.com/orgs/sendinblue  **Possible responses**   | Code | Message |   | :-------------: | ------------- |   | 200  | OK. Successful Request  |   | 201  | OK. Successful Creation |   | 202  | OK. Request accepted |   | 204  | OK. Successful Update/Deletion  |   | 400  | Error. Bad Request  |   | 401  | Error. Authentication Needed  |   | 402  | Error. Not enough credit, plan upgrade needed  |   | 403  | Error. Permission denied  |   | 404  | Error. Object does not exist |   | 405  | Error. Method not allowed  | 
 *
 * OpenAPI spec version: 3.0.0
 * Contact: contact@sendinblue.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package sibModel;

import org.apache.commons.lang3.ObjectUtils;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * GetClient
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-15T11:12:00.535+05:30")
public class GetClient {
  @SerializedName("email")
  private String email = null;

  @SerializedName("firstName")
  private String firstName = null;

  @SerializedName("lastName")
  private String lastName = null;

  @SerializedName("companyName")
  private String companyName = null;

  public GetClient email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Login Email
   * @return email
  **/
  @ApiModelProperty(example = "john.smith@example.com", required = true, value = "Login Email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public GetClient firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * First Name
   * @return firstName
  **/
  @ApiModelProperty(example = "John", required = true, value = "First Name")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public GetClient lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Last Name
   * @return lastName
  **/
  @ApiModelProperty(example = "Smith", required = true, value = "Last Name")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public GetClient companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

   /**
   * Name of the company
   * @return companyName
  **/
  @ApiModelProperty(example = "MyCompany", required = true, value = "Name of the company")
  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    GetClient getClient = (GetClient) o;
    return ObjectUtils.equals(this.email, getClient.email) &&
    ObjectUtils.equals(this.firstName, getClient.firstName) &&
    ObjectUtils.equals(this.lastName, getClient.lastName) &&
    ObjectUtils.equals(this.companyName, getClient.companyName);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(email, firstName, lastName, companyName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetClient {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
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

