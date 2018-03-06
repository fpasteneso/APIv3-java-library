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
import java.util.ArrayList;
import java.util.List;

/**
 * SendTestEmail
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-15T11:12:00.535+05:30")
public class SendTestEmail {
  @SerializedName("emailTo")
  private List<String> emailTo = null;

  public SendTestEmail emailTo(List<String> emailTo) {
    this.emailTo = emailTo;
    return this;
  }

  public SendTestEmail addEmailToItem(String emailToItem) {
    if (this.emailTo == null) {
      this.emailTo = new ArrayList<String>();
    }
    this.emailTo.add(emailToItem);
    return this;
  }

   /**
   * If empty the test email will be sent to your entire test list. Use this field to send it to specific addresses in your list.
   * @return emailTo
  **/
  @ApiModelProperty(value = "If empty the test email will be sent to your entire test list. Use this field to send it to specific addresses in your list.")
  public List<String> getEmailTo() {
    return emailTo;
  }

  public void setEmailTo(List<String> emailTo) {
    this.emailTo = emailTo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    SendTestEmail sendTestEmail = (SendTestEmail) o;
    return ObjectUtils.equals(this.emailTo, sendTestEmail.emailTo);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(emailTo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendTestEmail {\n");
    
    sb.append("    emailTo: ").append(toIndentedString(emailTo)).append("\n");
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

