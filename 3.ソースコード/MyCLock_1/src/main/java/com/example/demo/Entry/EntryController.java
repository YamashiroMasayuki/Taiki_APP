package com.example.demo.Entry;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.CommonWorkerService;

@Controller
public class EntryController {
	@Autowired
	private ModelMapper modelMapper;
	@Autowired
	private CreateUser createUser;

	//ユーザー登録画面URL
	String userEntryUrl = "/Entry";
	
	@RequestMapping("/Entry") // アクセス先URIに関連する
	public String main(Model model, @ModelAttribute EntryForm form) {

        model.addAttribute("generalFlg", "true" );
		var _commonWorker = new CommonWorkerService();


		
		return userEntryUrl;
	}
	

	@PostMapping("/Entry/CreateUser")
	public String createUser(Model model, @ModelAttribute EntryForm form) {

		var _commonWorker = new CommonWorkerService();
		
		EntryModel entryModel = modelMapper.map(form, EntryModel.class);
		createUser.creatUser(entryModel);
		
		

		
		return userEntryUrl;
	}
	
	
	
	
}
