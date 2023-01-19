package space.bumtiger.study.repository.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import space.bumtiger.study.domain.Diary;
import space.bumtiger.study.repository.DiaryRepository;

@Repository
public class DiaryRepositoryImpl implements DiaryRepository {
	@Autowired
	public NamedParameterJdbcTemplate jdbcTemplate;

	@Override
	public int save(Diary diary) {
		String sql = "insert into study.diary(title, content, study_date) "
				+ "values (:title, :content, :study_date)";
		Map<String, String> params = new HashMap<>();
		params.put("title", diary.getTitle());
		params.put("content", diary.getContent());
		params.put("study_date", diary.getStudyDate());
		return jdbcTemplate.update(sql, params);
	}

}
