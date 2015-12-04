package br.com.baldereducation.sitecore.service;

import br.com.baldereducation.sitecore.model.domain.to.StatisticTO;

public interface StatisticsService {
	public StatisticTO getStatistic();
	public StatisticTO postStatistic(StatisticTO statisticTO);
}
