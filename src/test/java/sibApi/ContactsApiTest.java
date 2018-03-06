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


package sibApi;

import sendinblue.ApiException;
import sibModel.AddRemoveContactToList;
import sibModel.CreateAttribute;
import sibModel.CreateContact;
import sibModel.CreateList;
import sibModel.CreateModel;
import sibModel.CreateUpdateFolder;
import sibModel.CreatedProcessId;
import sibModel.ErrorModel;
import sibModel.GetAttributes;
import sibModel.GetContactCampaignStats;
import sibModel.GetContacts;
import sibModel.GetExtendedContactDetails;
import sibModel.GetExtendedList;
import sibModel.GetFolder;
import sibModel.GetFolderLists;
import sibModel.GetFolders;
import sibModel.GetLists;
import org.threeten.bp.OffsetDateTime;
import sibModel.PostContactInfo;
import sibModel.RequestContactExport;
import sibModel.RequestContactImport;
import sibModel.UpdateAttribute;
import sibModel.UpdateContact;
import sibModel.UpdateList;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ContactsApi
 */
@Ignore
public class ContactsApiTest {

    private final ContactsApi api = new ContactsApi();

    
    /**
     * Add existing contacts to a list
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addContactToListTest() throws ApiException {
        Long listId = null;
        AddRemoveContactToList contactEmails = null;
        PostContactInfo response = api.addContactToList(listId, contactEmails);

        // TODO: test validations
    }
    
    /**
     * Creates contact attribute
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAttributeTest() throws ApiException {
        String attributeCategory = null;
        String attributeName = null;
        CreateAttribute createAttribute = null;
        api.createAttribute(attributeCategory, attributeName, createAttribute);

        // TODO: test validations
    }
    
    /**
     * Create a contact
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createContactTest() throws ApiException {
        CreateContact createContact = null;
        CreateModel response = api.createContact(createContact);

        // TODO: test validations
    }
    
    /**
     * Create a folder
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createFolderTest() throws ApiException {
        CreateUpdateFolder createFolder = null;
        CreateModel response = api.createFolder(createFolder);

        // TODO: test validations
    }
    
    /**
     * Create a list
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createListTest() throws ApiException {
        CreateList createList = null;
        CreateModel response = api.createList(createList);

        // TODO: test validations
    }
    
    /**
     * Deletes an attribute
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAttributeTest() throws ApiException {
        String attributeCategory = null;
        String attributeName = null;
        api.deleteAttribute(attributeCategory, attributeName);

        // TODO: test validations
    }
    
    /**
     * Delete a folder (and all its lists)
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteFolderTest() throws ApiException {
        Long folderId = null;
        api.deleteFolder(folderId);

        // TODO: test validations
    }
    
    /**
     * Delete a list
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteListTest() throws ApiException {
        Long listId = null;
        api.deleteList(listId);

        // TODO: test validations
    }
    
    /**
     * Lists all attributes
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAttributesTest() throws ApiException {
        GetAttributes response = api.getAttributes();

        // TODO: test validations
    }
    
    /**
     * Retrieves contact informations
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getContactInfoTest() throws ApiException {
        String email = null;
        GetExtendedContactDetails response = api.getContactInfo(email);

        // TODO: test validations
    }
    
    /**
     * Get the campaigns statistics for a contact
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getContactStatsTest() throws ApiException {
        String email = null;
        GetContactCampaignStats response = api.getContactStats(email);

        // TODO: test validations
    }
    
    /**
     * Get all the contacts
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getContactsTest() throws ApiException {
        Long limit = null;
        Long offset = null;
        OffsetDateTime modifiedSince = null;
        GetContacts response = api.getContacts(limit, offset, modifiedSince);

        // TODO: test validations
    }
    
    /**
     * Get the contacts in a list
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getContactsFromListTest() throws ApiException {
        Long listId = null;
        OffsetDateTime modifiedSince = null;
        Long limit = null;
        Long offset = null;
        GetContacts response = api.getContactsFromList(listId, modifiedSince, limit, offset);

        // TODO: test validations
    }
    
    /**
     * Returns folder details
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFolderTest() throws ApiException {
        Long folderId = null;
        GetFolder response = api.getFolder(folderId);

        // TODO: test validations
    }
    
    /**
     * Get the lists in a folder
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFolderListsTest() throws ApiException {
        Long folderId = null;
        Long limit = null;
        Long offset = null;
        GetFolderLists response = api.getFolderLists(folderId, limit, offset);

        // TODO: test validations
    }
    
    /**
     * Get all the folders
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFoldersTest() throws ApiException {
        Long limit = null;
        Long offset = null;
        GetFolders response = api.getFolders(limit, offset);

        // TODO: test validations
    }
    
    /**
     * Get the details of a list
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getListTest() throws ApiException {
        Long listId = null;
        GetExtendedList response = api.getList(listId);

        // TODO: test validations
    }
    
    /**
     * Get all the lists
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getListsTest() throws ApiException {
        Long limit = null;
        Long offset = null;
        GetLists response = api.getLists(limit, offset);

        // TODO: test validations
    }
    
    /**
     * Import contacts
     *
     * It returns the background process ID which on completion calls the notify URL that you have set in the input.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void importContactsTest() throws ApiException {
        RequestContactImport requestContactImport = null;
        CreatedProcessId response = api.importContacts(requestContactImport);

        // TODO: test validations
    }
    
    /**
     * Remove existing contacts from a list
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeContactToListTest() throws ApiException {
        Long listId = null;
        AddRemoveContactToList contactEmails = null;
        PostContactInfo response = api.removeContactToList(listId, contactEmails);

        // TODO: test validations
    }
    
    /**
     * Export contacts
     *
     * It returns the background process ID which on completion calls the notify URL that you have set in the input. File will be available in csv.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void requestContactExportTest() throws ApiException {
        RequestContactExport requestContactExport = null;
        CreatedProcessId response = api.requestContactExport(requestContactExport);

        // TODO: test validations
    }
    
    /**
     * Updates contact attribute
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateAttributeTest() throws ApiException {
        String attributeCategory = null;
        String attributeName = null;
        UpdateAttribute updateAttribute = null;
        api.updateAttribute(attributeCategory, attributeName, updateAttribute);

        // TODO: test validations
    }
    
    /**
     * Updates a contact
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateContactTest() throws ApiException {
        String email = null;
        UpdateContact updateContact = null;
        api.updateContact(email, updateContact);

        // TODO: test validations
    }
    
    /**
     * Update a contact folder
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateFolderTest() throws ApiException {
        Long folderId = null;
        CreateUpdateFolder updateFolder = null;
        api.updateFolder(folderId, updateFolder);

        // TODO: test validations
    }
    
    /**
     * Update a list
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateListTest() throws ApiException {
        Long listId = null;
        UpdateList updateList = null;
        api.updateList(listId, updateList);

        // TODO: test validations
    }
    
}
