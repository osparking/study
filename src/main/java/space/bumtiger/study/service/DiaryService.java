package space.bumtiger.study.service;

import java.util.List;

import space.bumtiger.study.domain.Diary;

public interface DiaryService {
	public int save(Diary diary);

	public List<Diary> listing();

	public Diary readDiary(String sno);
}
