package com.beibeiMajor.web.controller;

import com.beibeiMajor.web.service.DotaGameInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * 模态窗口
 * 
 * @author ruoyi
 */
@Controller
@RequestMapping("/syn")
public class SynInfoController {

    @Resource
    private DotaGameInfoService dotaGameInfoService;

    /**
     * 增量更新比赛数据
     */
    @GetMapping("/synGameIdOfLeagueMatch")
    public Boolean incrementalSynGameIdOfLeagueMatch() {
        List<Long> gameIdOfLeagueMatch = dotaGameInfoService.getGameIdOfLeagueMatch();
        return dotaGameInfoService.insertMatchDetailInfo(gameIdOfLeagueMatch);
    }

    /**
     * 全量更新英雄数据
     */
    @GetMapping("/synHeroesInfo")
    public Boolean synHeroesInfo() {
        return dotaGameInfoService.insertHeroesInfo();
    }

}
