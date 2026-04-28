package main;

package com.ibm.cloud.cloud_db2.db2saas.v1;
import com.ibm.cloud.db2saas.v1.model.*;
import com.ibm.cloud.sdk.core.security.IamAuthenticator;
import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;
import com.ibm.cloud.sdk.core.http.Response;

import java.util.Arrays;
import java.util.List;


public class Db2SaasExample {
    public static void main(String[] args) {
        try {
            // ===================== AUTHENTICATOR =====================
            String apiKey = System.getenv("DB2SAAS_APIKEY");
            String db2Url = System.getenv("DB2SAAS_URL");
            String deploymentID = System.getenv("DEPLOYMENT_ID");
            String xDepID = System.getenv("X_DEPLOYMENT_ID");

            if (deploymentID == null || deploymentID.isEmpty()) {
                deploymentID = "crn:v1:staging:public:dashdb-for-transactions:us-south:a/...::";
                System.out.println("Using default DEPLOYMENT_ID: " + deploymentID);
            }
            if (xDepID == null || xDepID.isEmpty()) {
                xDepID = deploymentID;
                System.out.println("Using default X_DEPLOYMENT_ID: " + xDepID);
            }

            if (apiKey == null || apiKey.isEmpty()) {
                throw new RuntimeException("Missing DB2SAAS_APIKEY env variable");
            }

            IamAuthenticator authenticator = new IamAuthenticator(apiKey);
            Db2saas service = new Db2saas("db2saas", authenticator);
            service.setServiceUrl(db2Url);

            // ===================== GET CONNECTION INFO =====================
            System.out.println("Calling GetDb2SaasConnectionInfo...");
            GetDb2SaasConnectionInfoOptions getOpts = new GetDb2SaasConnectionInfoOptions.Builder()
                    .deploymentId(deploymentID)
                    .xDeploymentId(xDepID)
                    .build();

            Response<ConnectionInfo> connResp = service.getDb2SaasConnectionInfo(getOpts).execute();
            ConnectionInfo connInfo = connResp.getResult();
            System.out.println("GetDb2SaasConnectionInfo Response Status: " + connResp.getStatusCode());
            System.out.println("Connection Info: " + connInfo);

            // ===================== POST ALLOWLIST =====================
            System.out.println("Calling PostDb2SaasAllowlist...");
            IpAddress ip1 = new IpAddress.Builder().address("127.0.0.26").description("Allowlist IP 6").build();
            IpAddress ip2 = new IpAddress.Builder().address("127.0.0.27").description("Allowlist IP 7").build();
            List<IpAddress> allowlistIPs = Arrays.asList(ip1, ip2);

            PostDb2SaasAllowlistOptions allowlistOpts = new PostDb2SaasAllowlistOptions.Builder()
                    .xDeploymentId(xDepID)
                    .ipAddresses(allowlistIPs)
                    .build();

            Response<AllowlistResponse> allowlistResp = service.postDb2SaasAllowlist(allowlistOpts).execute();
            System.out.println("Allowlist Response Status: " + allowlistResp.getStatusCode());
            System.out.println("Allowlist Result: " + allowlistResp.getResult());

            // ===================== POST USERS =====================
            System.out.println("Calling PostDb2SaasUsers...");
            CreateUserAuthentication auth = new CreateUserAuthentication.Builder()
                    .method("a")
                    .policyId("b")
                    .build();

            PostDb2SaasUserOptions postUserOpts = new PostDb2SaasUserOptions.Builder()
                    .xDeploymentId(xDepID)
                    .name("test-id1233")
                    .id("test-id1233")
                    .iam(false)
                    .ibmid("test-ibm-id")
                    .password("dEkMc43@gfAPl!867^dSbu")
                    .role("bluuser")
                    .email("test_user@mycompany.com")
                    .locked("yes")
                    .authentication(auth)
                    .build();

            Response<UserResponse> postUserResp = service.postDb2SaasUser(postUserOpts).execute();
            System.out.println("PostDb2SaasUsers Response Status: " + postUserResp.getStatusCode());
            System.out.println("PostDb2SaasUsers Result: " + postUserResp.getResult());

            // ===================== PUT USERS =====================
            System.out.println("Calling PutDb2SaasUsers...");
            UpdateUserAuthentication updateAuth = new UpdateUserAuthentication.Builder()
                    .method("internal")
                    .policyId("Default")
                    .build();

            PutDb2SaasUserOptions putUserOpts = new PutDb2SaasUserOptions.Builder()
                    .xDeploymentId(xDepID)
                    .id("test-id1233")
                    .newId("test-id1233")
                    .newName("test-id1233")
                    .newIam(false)
                    .newIbmid("test-ibm-id")
                    .newPassword("dEkMc43@gfAPl!867^dSbu")
                    .newRole("bluuser")
                    .newLocked("no")
                    .newEmail("test_user1@mycompany.com")
                    .newAuthentication(updateAuth)
                    .build();

            Response<UserResponse> putUserResp = service.putDb2SaasUser(putUserOpts).execute();
            System.out.println("PutDb2SaasUser Response Status: " + putUserResp.getStatusCode());
            System.out.println("PutDb2SaasUser Result: " + putUserResp.getResult());

            // ===================== DELETE USERS =====================
            System.out.println("Calling DeleteDb2SaasUser...");
            DeleteDb2SaasUserOptions deleteOpts = new DeleteDb2SaasUserOptions.Builder()
                    .xDeploymentId(xDepID)
                    .id("test-id123")
                    .build();

            Response<Void> deleteResp = service.deleteDb2SaasUser(deleteOpts).execute();
            System.out.println("DeleteDb2SaasUser Response Status: " + deleteResp.getStatusCode());

            // ===================== GET USERS =====================
            System.out.println("Calling GetDb2SaasUsers...");
            GetDb2SaasUserOptions getUsersOpts = new GetDb2SaasUserOptions.Builder()
                    .xDeploymentId(xDepID)
                    .build();

            Response<UsersResponse> getUsersResp = service.getDb2SaasUser(getUsersOpts).execute();
            System.out.println("GetDb2SaasUsers Response Status: " + getUsersResp.getStatusCode());
            System.out.println("GetDb2SaasUsers Result: " + getUsersResp.getResult());

        } catch (ServiceResponseException e) {
            System.err.println("Service returned status code "
                    + e.getStatusCode() + ": " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
