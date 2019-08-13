package com.qf.web;

import com.qf.bean.EasyWrong;
import com.qf.bean.VipQuestionBank;
import com.qf.service.EasywrongService;
import com.qf.service.VipQuestionBankService;
import com.qf.util.DataView;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 鸡你太美
 */
@RestController
public class VipQuestionBankController {

    @Resource
    private VipQuestionBankService vipQuestionBankService;
    @Resource
    private EasywrongService easywrongService;

    /**
     * 1. vip模拟考试 全部查询
     * @return
     */
    @RequestMapping("/selectVipBank")
    public DataView getAll(){
        DataView<VipQuestionBank> dataView = new DataView<>();
        dataView.setCode(0);

        List<VipQuestionBank> vipQuestionBankList = vipQuestionBankService.findAll();

        if(vipQuestionBankList!=null){
            dataView.setMsg("成功");
            dataView.setDataList(vipQuestionBankList);
        }

        return dataView;
    }

    /**
     * 2.vip背题模式 主键查询
     * @param questionId
     * @return
     */
    @RequestMapping("/selectOneVipQuestion")
    public Map getOne(int questionId){
        Map map = new HashMap();
        map.put("Code",0);
        map.put("Msg","成功");
        map.put("data",vipQuestionBankService.selectByPrimaryKey(questionId));

        return map;
    }

    /**
     * 3. vip易错题 全部查询
     * @return
     */
    @RequestMapping("/selectEasyWrongs")
    public DataView getAllEasyWrongs(){
        DataView<EasyWrong> dataView = new DataView<>();
        dataView.setCode(0);
        dataView.setMsg("成功");
        List<EasyWrong> easyWrongList = easywrongService.getall();
        dataView.setDataList(easyWrongList);
        return dataView;
    }

    /**
     * 4.vip单个易错题 主键查询
     * @param easyWrongId
     * @return
     */
    @RequestMapping("/selectOneEasywrong")
    public Map getOneEasyWrong(int easyWrongId){
        Map map = new HashMap();
        map.put("Code",0);
        map.put("Msg","成功");
        map.put("data",easywrongService.selectByPrimaryKey(easyWrongId));

        return map;
    }

    /**
     * 5.考前突击 随机考试
     * @return
     */
    @RequestMapping("/selectVipForRandom")
    public DataView selectForRandom(){
        DataView dataView = new DataView();
        //调用service
        List<VipQuestionBank> vipForRandomList = vipQuestionBankService.selectVipForRandom();
        if (vipForRandomList !=null){
            dataView.setMsg("查询成功");
            dataView.setCode(0);
            dataView.setData(vipForRandomList);
            return dataView;
        }
        return null;
    }










}
