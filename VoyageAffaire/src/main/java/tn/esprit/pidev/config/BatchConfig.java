package tn.esprit.pidev.config;

import javax.sql.DataSource;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBatchProcessing
public class BatchConfig {
	/*@Autowired
	JobBuilderFactory jobbuilderFactory;
	@Autowired
	StepBuilderFactory stepBuilderFactory;
	@Autowired
	DataSource dataSource;
	
	@Bean
	public Job emailsenderjob()
	{
		return jobbuilderFactory.get("emailSenderJob")
				.start(emailSenderStep())
				.build();
	}
	@Bean
	private Step emailSenderStep() {
		// TODO Auto-generated method stub
		return stepBuilderFactory.get("emailsenderstep")
				.chunk(100)
				.reader(orderitemreader())
				.processor(orderProcessor)
				.writer(orderWriter())
				.build();
	}*/

	
}
