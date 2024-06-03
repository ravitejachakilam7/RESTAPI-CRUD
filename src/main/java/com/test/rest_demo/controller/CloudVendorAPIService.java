package com.test.rest_demo.controller;

import com.test.rest_demo.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/CloudVendor")
public class CloudVendorAPIService
{
    CloudVendor cloudVendor;
    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendorId)
    {
        return cloudVendor;

    }
    @PostMapping
    public String createCloudVenodrDetails(@RequestBody CloudVendor cloudVendor)
    {
        this.cloudVendor = cloudVendor;
        return "Cloud vendor created successfully";
    }
    @PutMapping
    public String updateCloudVenodrDetails(@RequestBody CloudVendor cloudVendor)
    {
        this.cloudVendor = cloudVendor;
        return "Cloud vendor Updated successfully";
    }
    @DeleteMapping("{vendorId}")
    public String deleteCloudVenodrDetails(String vendorID)
    {
        this.cloudVendor = null;
        return "Cloud vendor deleted successfully";
    }
}
