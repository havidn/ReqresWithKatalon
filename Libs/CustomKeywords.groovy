
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String

import com.kms.katalon.core.testobject.TestObject



def static "sample.Common.createNewUser"(
    	int age	
     , 	String username	
     , 	String password	
     , 	String gender	
     , 	int expectedStatus	) {
    (new sample.Common()).createNewUser(
        	age
         , 	username
         , 	password
         , 	gender
         , 	expectedStatus)
}


def static "sample.Common.findUserById"(
    	int id	
     , 	int age	
     , 	String username	
     , 	String password	
     , 	String gender	
     , 	int expectedStatus	) {
    (new sample.Common()).findUserById(
        	id
         , 	age
         , 	username
         , 	password
         , 	gender
         , 	expectedStatus)
}

 /**
	 * Send request and verify status code
	 * @param request request object, must be an instance of RequestObject
	 * @param expectedStatusCode
	 * @return a boolean to indicate whether the response status code equals the expected one
	 */ 
def static "test.key.verifyStatusCode"(
    	TestObject request	
     , 	int expectedStatusCode	) {
    (new test.key()).verifyStatusCode(
        	request
         , 	expectedStatusCode)
}


def static "test.key.addGlobalVariable"(
    	String name	
     , 	Object value	) {
    (new test.key()).addGlobalVariable(
        	name
         , 	value)
}

 /**
	 * Add Header basic authorization field,
	 * this field value is Base64 encoded token from user name and password
	 * @param request object, must be an instance of RequestObject
	 * @param username username
	 * @param password password
	 * @return the original request object with basic authorization header field added
	 */ 
def static "test.key.addBasicAuthorizationProperty"(
    	TestObject request	
     , 	String username	
     , 	String password	) {
    (new test.key()).addBasicAuthorizationProperty(
        	request
         , 	username
         , 	password)
}
