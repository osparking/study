package space.bumtiger.study.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class RootConfiguration {
	@Bean
	public NamedParameterJdbcTemplate getJdbcTemplate() {
		var jdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
		return jdbcTemplate;
	}
	
	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName(org.mariadb.jdbc.Driver.class.getName());
		ds.setUrl("jdbc:mariadb://localhost:3306/study");
		ds.setUsername("myself");
		ds.setPassword("`2m_^g]PB->m");
		return ds;		
	}
}
