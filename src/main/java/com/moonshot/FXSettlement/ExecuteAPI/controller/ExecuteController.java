package com.moonshot.FXSettlement.ExecuteAPI.controller;

import com.moonshot.FXSettlement.ExecuteAPI.entity.FXStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sweeps")
public class ExecuteController {
@RequestMapping("/{AccNum}")
    public FXStatus executeSweep(@PathVariable("AccNum") String AccNum){
        return new FXStatus("success",AccNum);
//use WebClient to call another rest API
    }

}
