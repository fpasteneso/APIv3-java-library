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
import sibModel.CreateModel;
import sibModel.CreateUpdateFolder;
import sibModel.ErrorModel;
import sibModel.GetFolder;
import sibModel.GetFolderLists;
import sibModel.GetFolders;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FoldersApi
 */
@Ignore
public class FoldersApiTest {

    private final FoldersApi api = new FoldersApi();

    
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
    
}
