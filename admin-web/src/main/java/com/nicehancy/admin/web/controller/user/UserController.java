package com.nicehancy.admin.web.controller.user;

import com.nicehancy.admin.web.controller.base.BaseController;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.UUID;

/**
 * <p>
 * <p/>
 *
 * @author hancaiyun
 * @since 2020/7/1 9:23
 **/
@Slf4j
@Controller
public class UserController extends BaseController {

    /**
     * 主页
     * @return      主页视图
     */
    @RequestMapping("/user/list")
    public ModelAndView index(){
        return new ModelAndView("component/user/user-list");
    }

    /**
     * 分页查询
     * @return      分页查询结果列表
     */
    @RequestMapping("/user/pageQuery")
    @ResponseBody
    public ModelMap pageQuery(HttpServletRequest request){
        String traceLogId = UUID.randomUUID().toString();
        MDC.put("TRACE_LOG_ID", traceLogId);
//        FileUploadRecordPageQueryReqDTO reqDTO = new FileUploadRecordPageQueryReqDTO();
//        reqDTO.setUserNo(this.getParameters(request).get("userNo"));
//        reqDTO.setFileId(this.getParameters(request).get("fileId"));
//        reqDTO.setFileName(this.getParameters(request).get("fileName"));
//        reqDTO.setFileType(this.getParameters(request).get("fileType"));
//        reqDTO.setCurrentPage(Integer.valueOf(this.getParameters(request).get("page")));
//        reqDTO.setPageSize(Integer.valueOf(this.getParameters(request).get("limit")));
//        reqDTO.setRequestSystem("SYSTEM");
//        reqDTO.setTraceLogId(traceLogId);
        //log.info("FileManageController pageQuery request PARAM: reqDTO={}", reqDTO);
        //Result<BasePageQueryResDTO<FileUploadRecordDTO>> result =  fileManagementService.pageQuery(reqDTO);
        ModelMap modelMap;
//        if(result.isSuccess()){
//            if(!CollectionUtils.isEmpty(result.getResult().getPageResult())) {
//                modelMap = this.processSuccessJSON(result.getResult().getPageResult(), result.getResult().getCount());
//            } else {
//                modelMap = this.processSuccessJSON("查无数据");
//            }
//        }else{
//            modelMap = this.processSuccessJSON(result.getErrorMsg());
//        }
        modelMap = this.processSuccessJSON("查无数据");
        log.info("FileManageController pageQuery result modelMap={}", modelMap);
        return modelMap;
    }
}
