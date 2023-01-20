package space.bumtiger.study.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import space.bumtiger.study.domain.Diary;
import space.bumtiger.study.repository.DiaryRepository;
import space.bumtiger.study.service.DiaryService;

@Service
public class DiaryServiceImpl implements DiaryService {

	@Autowired
	public DiaryRepository diaryRepository;

	@Override
	public int save(Diary diary) {
		return diaryRepository.save(diary);
	}

	@Override
	public List<Diary> listing() {
		return diaryRepository.listing();
	}

	@Override
	public Diary readDiary(String sno) {
		return diaryRepository.readDiary(sno);
	}

}
