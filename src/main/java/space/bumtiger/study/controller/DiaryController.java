package space.bumtiger.study.controller;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import space.bumtiger.study.domain.Diary;
import space.bumtiger.study.service.DiaryService;

@Controller
@RequestMapping("diary")
public class DiaryController {
	@Autowired
	public DiaryService diaryService;

	@PostMapping("save")
	public String save(HttpServletRequest request, HttpServletResponse response) {
		try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		Diary diary = new Diary();
		diary.setTitle(request.getParameter("title"));
		diary.setContent(request.getParameter("content"));
		diary.setStudyDate(request.getParameter("studyDate"));
		diaryService.save(diary);
		return "redirect:listing";
	}

	@GetMapping("listing")
	public String listing(Model model) {
		var diaries = new ArrayList<Diary>();
		Diary diary1 = new Diary(1, "깃 기본 명령", "", "2023-01-31", (short) 120);
		Diary diary2 = new Diary(2, "깃 기본 명령", "", "2023-01-31", (short) 120);
		diaries.add(diary1);
		diaries.add(diary2);
		model.addAttribute("diaries", diaries);
		return "listing";
	}

	@GetMapping("write")
	public String writeDiary() {
		return "diary";
	}
}
