package br.com.baldereducation.sitecore.service;

import br.com.baldereducation.sitecore.model.domain.to.StatisticTO;

public interface StatisticsService {
	
	public static final String URL_APP_STATISTICS_GET_PROGRESSION = "http://localhost:8989";
	public static final String URL_APP_STATISTICS_POST_PROGRESSION = "http://localhost:8989";
	
	public StatisticTO getStatistic();
	public StatisticTO postStatistic(StatisticTO statisticTO);
}
