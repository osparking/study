package space.bumtiger.study.controller;

import java.io.UnsupportedEncodingException;

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
		model.addAttribute("diaries", diaryService.listing());
		return "listing";
	}

	@GetMapping("read")
	public String readDiary(Model model) {
		Diary diary = new Diary(15, "자바 람다식",
				"람다식이 필요한 경우, 함수적 인터페이스, 함수적 메소드 등을 학습하였다", "2023-01-16", (short) 60);
		model.addAttribute("diary", diary);
		return "diary";
	}

	@GetMapping("write")
	public String writeDiary() {
		return "diary";
	}
}
