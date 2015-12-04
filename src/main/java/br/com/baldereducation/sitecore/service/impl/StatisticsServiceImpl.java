package br.com.baldereducation.sitecore.service.impl;

import org.springframework.web.client.RestTemplate;

import br.com.baldereducation.sitecore.model.domain.to.StatisticTO;
import br.com.baldereducation.sitecore.service.StatisticsService;

public class StatisticsServiceImpl implements StatisticsService {

	@Override
	public StatisticTO getStatistic() {
		RestTemplate restTemplate = new RestTemplate();
		StatisticTO statisticTO = restTemplate.getForObject(
				"http://localhost:8080", StatisticTO.class);

		return statisticTO;
	}

	@Override
	public StatisticTO postStatistic(StatisticTO statisticTO) {
		final String uri = "http://localhost:8080/springrestexample/employees";

		RestTemplate restTemplate = new RestTemplate();
		StatisticTO result = restTemplate.postForObject(uri, statisticTO,
				StatisticTO.class);

		System.out.println(result);
		return result;
	}

}
