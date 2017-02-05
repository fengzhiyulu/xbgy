package com.xbgy.system.controller;

import java.io.File;
import java.io.FileReader;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.xbgy.system.controller.subType.RoomIn;
import com.xbgy.system.model.Room;
import com.xbgy.system.util.Page;

@Controller
@RequestMapping("/room")
/**
 * @author grubby
 */
public class RoomController{

	@ResponseBody
	@RequestMapping(value="/search", method=RequestMethod.GET)
	public Page<Room> search(RoomIn in){
		Page<Room> page = new Page<Room>();
		page.setPageInex(1);
		return page;
	}
}
