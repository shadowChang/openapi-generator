/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.3.1-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.virtualan.api;

import java.util.List;
import org.openapitools.virtualan.model.User;
import io.swagger.v3.oas.annotations.*;
import io.swagger.v3.oas.annotations.enums.*;
import io.swagger.v3.oas.annotations.media.*;
import io.swagger.v3.oas.annotations.responses.*;
import io.swagger.v3.oas.annotations.security.*;
import io.virtualan.annotation.ApiVirtual;
import io.virtualan.annotation.VirtualService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Validated
@VirtualService
public interface UserApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /user : Create user
     * This can only be done by the logged in user.
     *
     * @param body Created user object (required)
     * @return successful operation (status code 200)
     */
    @ApiVirtual
    @Operation(summary = "Create user", operationId = "createUser", description = "This can only be done by the logged in user.", responses={ 
            @ApiResponse(responseCode = "200", description = "successful operation") }
    
    , tags={ "user", })
    @RequestMapping(value = "/user",
        method = RequestMethod.POST)
    default ResponseEntity<Void> createUser(


@Parameter(description = "Created user object" ,required=true)@Valid @RequestBody User body

) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /user/createWithArray : Creates list of users with given input array
     *
     * @param body List of user object (required)
     * @return successful operation (status code 200)
     */
    @ApiVirtual
    @Operation(summary = "Creates list of users with given input array", operationId = "createUsersWithArrayInput", description = "", responses={ 
            @ApiResponse(responseCode = "200", description = "successful operation") }
    
    , tags={ "user", })
    @RequestMapping(value = "/user/createWithArray",
        method = RequestMethod.POST)
    default ResponseEntity<Void> createUsersWithArrayInput(


@Parameter(description = "List of user object" ,required=true)@Valid @RequestBody List<User> body

) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /user/createWithList : Creates list of users with given input array
     *
     * @param body List of user object (required)
     * @return successful operation (status code 200)
     */
    @ApiVirtual
    @Operation(summary = "Creates list of users with given input array", operationId = "createUsersWithListInput", description = "", responses={ 
            @ApiResponse(responseCode = "200", description = "successful operation") }
    
    , tags={ "user", })
    @RequestMapping(value = "/user/createWithList",
        method = RequestMethod.POST)
    default ResponseEntity<Void> createUsersWithListInput(


@Parameter(description = "List of user object" ,required=true)@Valid @RequestBody List<User> body

) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /user/{username} : Delete user
     * This can only be done by the logged in user.
     *
     * @param username The name that needs to be deleted (required)
     * @return Invalid username supplied (status code 400)
     *         or User not found (status code 404)
     */
    @ApiVirtual
    @Operation(summary = "Delete user", operationId = "deleteUser", description = "This can only be done by the logged in user.", responses={ 
            @ApiResponse(responseCode = "400", description = "Invalid username supplied"),
            @ApiResponse(responseCode = "404", description = "User not found") }
    
    , tags={ "user", })
    @RequestMapping(value = "/user/{username}",
        method = RequestMethod.DELETE)
    default ResponseEntity<Void> deleteUser(
@Parameter(description = "The name that needs to be deleted",required=true)@PathVariable("username") String username



) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /user/{username} : Get user by user name
     *
     * @param username The name that needs to be fetched. Use user1 for testing. (required)
     * @return successful operation (status code 200)
     *         or Invalid username supplied (status code 400)
     *         or User not found (status code 404)
     */
    @ApiVirtual
    @Operation(summary = "Get user by user name", operationId = "getUserByName", description = "", responses={ 
            @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(schema = @Schema(implementation = User.class))),
            @ApiResponse(responseCode = "400", description = "Invalid username supplied"),
            @ApiResponse(responseCode = "404", description = "User not found") }
    
    , tags={ "user", })
    @RequestMapping(value = "/user/{username}",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<User> getUserByName(
@Parameter(description = "The name that needs to be fetched. Use user1 for testing.",required=true)@PathVariable("username") String username



) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"password\" : \"password\", \"userStatus\" : 6, \"phone\" : \"phone\", \"id\" : 0, \"email\" : \"email\", \"username\" : \"username\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    String exampleString = "<User> <id>123456789</id> <username>aeiou</username> <firstName>aeiou</firstName> <lastName>aeiou</lastName> <email>aeiou</email> <password>aeiou</password> <phone>aeiou</phone> <userStatus>123</userStatus> </User>";
                    ApiUtil.setExampleResponse(request, "application/xml", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /user/login : Logs user into the system
     *
     * @param username The user name for login (required)
     * @param password The password for login in clear text (required)
     * @return successful operation (status code 200)
     *         or Invalid username/password supplied (status code 400)
     */
    @ApiVirtual
    @Operation(summary = "Logs user into the system", operationId = "loginUser", description = "", responses={ 
            @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(schema = @Schema(implementation = String.class))),
            @ApiResponse(responseCode = "400", description = "Invalid username/password supplied") }
    
    , tags={ "user", })
    @RequestMapping(value = "/user/login",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<String> loginUser(@NotNull @Parameter(description = "The user name for login", required = true)@Valid @RequestParam(value = "username", required = true) String username




,@NotNull @Parameter(description = "The password for login in clear text", required = true)@Valid @RequestParam(value = "password", required = true) String password




) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /user/logout : Logs out current logged in user session
     *
     * @return successful operation (status code 200)
     */
    @ApiVirtual
    @Operation(summary = "Logs out current logged in user session", operationId = "logoutUser", description = "", responses={ 
            @ApiResponse(responseCode = "200", description = "successful operation") }
    
    , tags={ "user", })
    @RequestMapping(value = "/user/logout",
        method = RequestMethod.GET)
    default ResponseEntity<Void> logoutUser() {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /user/{username} : Updated user
     * This can only be done by the logged in user.
     *
     * @param username name that need to be deleted (required)
     * @param body Updated user object (required)
     * @return Invalid user supplied (status code 400)
     *         or User not found (status code 404)
     */
    @ApiVirtual
    @Operation(summary = "Updated user", operationId = "updateUser", description = "This can only be done by the logged in user.", responses={ 
            @ApiResponse(responseCode = "400", description = "Invalid user supplied"),
            @ApiResponse(responseCode = "404", description = "User not found") }
    
    , tags={ "user", })
    @RequestMapping(value = "/user/{username}",
        method = RequestMethod.PUT)
    default ResponseEntity<Void> updateUser(
@Parameter(description = "name that need to be deleted",required=true)@PathVariable("username") String username



,


@Parameter(description = "Updated user object" ,required=true)@Valid @RequestBody User body

) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
