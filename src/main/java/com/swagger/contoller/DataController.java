package com.swagger.contoller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.swagger.ApiSet.Data;
import com.swagger.mapper.DataMapper;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@Api(value="", description="")
public class DataController {
	
	@Autowired
    DataMapper atecDataMapper;

	@CrossOrigin
	@ApiOperation(value = "", nickname = "")
	@ApiImplicitParams({
//		@ApiImplicitParam(name = "siteIdx", value="사이트고유번호(프로파일이 등록되어 있어야 설비정보가 조회됨)", required = true, dataType = "string", paramType = "query"), //paramType = "query or path"
	})
	@ApiModelProperty(required = false, hidden = true)
	@RequestMapping(method = RequestMethod.POST, path="/atecGetData", produces = "application/json")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "성공", response = Data.class),
			@ApiResponse(code = 401, message = "엑세스가 인증되지 않았습니다."),
			@ApiResponse(code = 403, message = "서버에서 접근을 거부했습니다."),
			@ApiResponse(code = 404, message = "페이지를 찾을 수 없습니다."),
			@ApiResponse(code = 500, message = "서버 이상 및 서버스크립트 오류입니다.")})
	public Data getData() throws Exception {
		ArrayList<HashMap<String, Object>> getData = null;
		return new Data(getData);
	}
	

}
