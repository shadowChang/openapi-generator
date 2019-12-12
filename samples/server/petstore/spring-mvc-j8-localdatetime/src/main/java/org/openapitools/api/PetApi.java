/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.2.3-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.ModelApiResponse;
import org.openapitools.model.Pet;
import org.springframework.core.io.Resource;
import io.swagger.v3.oas.annotations.*;
import io.swagger.v3.oas.annotations.enums.*;
import io.swagger.v3.oas.annotations.media.*;
import io.swagger.v3.oas.annotations.responses.*;
import io.swagger.v3.oas.annotations.security.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
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
public interface PetApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /pet : Add a new pet to the store
     *
     * @param body Pet object that needs to be added to the store (required)
     * @return successful operation (status code 200)
     *         or Invalid input (status code 405)
     */
    @Operation(summary = "Add a new pet to the store", operationId = "addPet", description = "", responses={ 
            @ApiResponse(responseCode = "200", description = "successful operation"),
            @ApiResponse(responseCode = "405", description = "Invalid input") }
    
    , security = { @SecurityRequirement(name = "petstore_auth", scopes = { "write:pets", "read:pets" }) }, tags={ "pet", })
    @RequestMapping(value = "/pet",
        consumes = { "application/json", "application/xml" },
        method = RequestMethod.POST)
    default ResponseEntity<Void> addPet(


@Parameter(description = "Pet object that needs to be added to the store" ,required=true)@Valid @RequestBody Pet body

) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /pet/{petId} : Deletes a pet
     *
     * @param petId Pet id to delete (required)
     * @param apiKey  (optional)
     * @return successful operation (status code 200)
     *         or Invalid pet value (status code 400)
     */
    @Operation(summary = "Deletes a pet", operationId = "deletePet", description = "", responses={ 
            @ApiResponse(responseCode = "200", description = "successful operation"),
            @ApiResponse(responseCode = "400", description = "Invalid pet value") }
    
    , security = { @SecurityRequirement(name = "petstore_auth", scopes = { "write:pets", "read:pets" }) }, tags={ "pet", })
    @RequestMapping(value = "/pet/{petId}",
        method = RequestMethod.DELETE)
    default ResponseEntity<Void> deletePet(
@Parameter(description = "Pet id to delete",required=true)@PathVariable("petId") Long petId



,

@Parameter(description = "", in=ParameterIn.HEADER )@RequestHeader(value="api_key", required=false) String apiKey


) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /pet/findByStatus : Finds Pets by status
     * Multiple status values can be provided with comma separated strings
     *
     * @param status Status values that need to be considered for filter (required)
     * @return successful operation (status code 200)
     *         or Invalid status value (status code 400)
     */
    @Operation(summary = "Finds Pets by status", operationId = "findPetsByStatus", description = "Multiple status values can be provided with comma separated strings", responses={ 
            @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(schema = @Schema(implementation = Pet.class))),
            @ApiResponse(responseCode = "400", description = "Invalid status value") }
    
    , security = { @SecurityRequirement(name = "petstore_auth", scopes = { "write:pets", "read:pets" }) }, tags={ "pet", })
    @RequestMapping(value = "/pet/findByStatus",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<Pet>> findPetsByStatus(@NotNull @Parameter(description = "Status values that need to be considered for filter", required = true, schema=@Schema(allowableValues="available, pending, sold"))@Valid @RequestParam(value = "status", required = true) List<String> status




) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"photoUrls\" : [ \"photoUrls\", \"photoUrls\" ], \"name\" : \"doggie\", \"id\" : 0, \"category\" : { \"name\" : \"default-name\", \"id\" : 6 }, \"tags\" : [ { \"name\" : \"name\", \"id\" : 1 }, { \"name\" : \"name\", \"id\" : 1 } ], \"status\" : \"available\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    String exampleString = "<Pet> <id>123456789</id> <name>doggie</name> <photoUrls> <photoUrls>aeiou</photoUrls> </photoUrls> <tags> </tags> <status>aeiou</status> </Pet>";
                    ApiUtil.setExampleResponse(request, "application/xml", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /pet/findByTags : Finds Pets by tags
     * Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
     *
     * @param tags Tags to filter by (required)
     * @return successful operation (status code 200)
     *         or Invalid tag value (status code 400)
     * @deprecated
     */
    @Operation(summary = "Finds Pets by tags", operationId = "findPetsByTags", description = "Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.", responses={ 
            @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(schema = @Schema(implementation = Pet.class))),
            @ApiResponse(responseCode = "400", description = "Invalid tag value") }
    
    , security = { @SecurityRequirement(name = "petstore_auth", scopes = { "write:pets", "read:pets" }) }, tags={ "pet", })
    @RequestMapping(value = "/pet/findByTags",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<Pet>> findPetsByTags(@NotNull @Parameter(description = "Tags to filter by", required = true)@Valid @RequestParam(value = "tags", required = true) List<String> tags




) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"photoUrls\" : [ \"photoUrls\", \"photoUrls\" ], \"name\" : \"doggie\", \"id\" : 0, \"category\" : { \"name\" : \"default-name\", \"id\" : 6 }, \"tags\" : [ { \"name\" : \"name\", \"id\" : 1 }, { \"name\" : \"name\", \"id\" : 1 } ], \"status\" : \"available\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    String exampleString = "<Pet> <id>123456789</id> <name>doggie</name> <photoUrls> <photoUrls>aeiou</photoUrls> </photoUrls> <tags> </tags> <status>aeiou</status> </Pet>";
                    ApiUtil.setExampleResponse(request, "application/xml", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /pet/{petId} : Find pet by ID
     * Returns a single pet
     *
     * @param petId ID of pet to return (required)
     * @return successful operation (status code 200)
     *         or Invalid ID supplied (status code 400)
     *         or Pet not found (status code 404)
     */
    @Operation(summary = "Find pet by ID", operationId = "getPetById", description = "Returns a single pet", responses={ 
            @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(schema = @Schema(implementation = Pet.class))),
            @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
            @ApiResponse(responseCode = "404", description = "Pet not found") }
    
    , security = { @SecurityRequirement(name = "api_key") }, tags={ "pet", })
    @RequestMapping(value = "/pet/{petId}",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<Pet> getPetById(
@Parameter(description = "ID of pet to return",required=true)@PathVariable("petId") Long petId



) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"photoUrls\" : [ \"photoUrls\", \"photoUrls\" ], \"name\" : \"doggie\", \"id\" : 0, \"category\" : { \"name\" : \"default-name\", \"id\" : 6 }, \"tags\" : [ { \"name\" : \"name\", \"id\" : 1 }, { \"name\" : \"name\", \"id\" : 1 } ], \"status\" : \"available\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    String exampleString = "<Pet> <id>123456789</id> <name>doggie</name> <photoUrls> <photoUrls>aeiou</photoUrls> </photoUrls> <tags> </tags> <status>aeiou</status> </Pet>";
                    ApiUtil.setExampleResponse(request, "application/xml", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /pet : Update an existing pet
     *
     * @param body Pet object that needs to be added to the store (required)
     * @return successful operation (status code 200)
     *         or Invalid ID supplied (status code 400)
     *         or Pet not found (status code 404)
     *         or Validation exception (status code 405)
     */
    @Operation(summary = "Update an existing pet", operationId = "updatePet", description = "", responses={ 
            @ApiResponse(responseCode = "200", description = "successful operation"),
            @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
            @ApiResponse(responseCode = "404", description = "Pet not found"),
            @ApiResponse(responseCode = "405", description = "Validation exception") }
    
    , security = { @SecurityRequirement(name = "petstore_auth", scopes = { "write:pets", "read:pets" }) }, tags={ "pet", })
    @RequestMapping(value = "/pet",
        consumes = { "application/json", "application/xml" },
        method = RequestMethod.PUT)
    default ResponseEntity<Void> updatePet(


@Parameter(description = "Pet object that needs to be added to the store" ,required=true)@Valid @RequestBody Pet body

) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /pet/{petId} : Updates a pet in the store with form data
     *
     * @param petId ID of pet that needs to be updated (required)
     * @param name Updated name of the pet (optional)
     * @param status Updated status of the pet (optional)
     * @return Invalid input (status code 405)
     */
    @Operation(summary = "Updates a pet in the store with form data", operationId = "updatePetWithForm", description = "", responses={ 
            @ApiResponse(responseCode = "405", description = "Invalid input") }
    
    , security = { @SecurityRequirement(name = "petstore_auth", scopes = { "write:pets", "read:pets" }) }, tags={ "pet", })
    @RequestMapping(value = "/pet/{petId}",
        consumes = { "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    default ResponseEntity<Void> updatePetWithForm(
@Parameter(description = "ID of pet that needs to be updated",required=true)@PathVariable("petId") Long petId



,



@Parameter(description = "Updated name of the pet") @RequestParam(value="name", required=false)  String name
,



@Parameter(description = "Updated status of the pet") @RequestParam(value="status", required=false)  String status
) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /pet/{petId}/uploadImage : uploads an image
     *
     * @param petId ID of pet to update (required)
     * @param additionalMetadata Additional data to pass to server (optional)
     * @param file file to upload (optional)
     * @return successful operation (status code 200)
     */
    @Operation(summary = "uploads an image", operationId = "uploadFile", description = "", responses={ 
            @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(schema = @Schema(implementation = ModelApiResponse.class))) }
    
    , security = { @SecurityRequirement(name = "petstore_auth", scopes = { "write:pets", "read:pets" }) }, tags={ "pet", })
    @RequestMapping(value = "/pet/{petId}/uploadImage",
        produces = { "application/json" }, 
        consumes = { "multipart/form-data" },
        method = RequestMethod.POST)
    default ResponseEntity<ModelApiResponse> uploadFile(
@Parameter(description = "ID of pet to update",required=true)@PathVariable("petId") Long petId



,



@Parameter(description = "Additional data to pass to server") @RequestParam(value="additionalMetadata", required=false)  String additionalMetadata
,



@Parameter(description = "file to upload") @Valid @RequestPart("file") MultipartFile file
) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 0, \"type\" : \"type\", \"message\" : \"message\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
