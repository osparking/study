package space.bumtiger.study.repository;

import java.util.List;

import space.bumtiger.study.domain.Diary;

public interface DiaryRepository {
	int save(Diary diary);

	List<Diary> listing();

	Diary readDiary(String sno);
}
