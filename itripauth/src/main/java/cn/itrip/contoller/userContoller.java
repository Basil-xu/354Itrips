package cn.itrip.contoller;







import cn.itrip.dao.itripUser.ItripUserMapper;
import com.alibaba.fastjson.JSONArray;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class userContoller {

 /*  @Resource
    ItripAreaDicMapper  dao;

    @RequestMapping(value="json",method= RequestMethod.GET,produces="application/json; charset=utf-8")
    @ResponseBody
    public Object statusup(int pid) throws Exception {
        return JSONArray.toJSONString(dao.getItripAreaDicById(new Long(pid)));
    }*/
   @Resource
 ItripUserMapper dao;
    @RequestMapping(value = "/json",method = RequestMethod.GET,produces = "application/json;charset=utf-8")
    @ResponseBody
    public Object t1(String pid) throws Exception {

         return JSONArray.toJSONString(dao.getItripUserById(new Long(pid)));
    }

}
