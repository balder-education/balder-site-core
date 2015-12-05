package br.com.baldereducation.sitecore.service.impl;

import br.com.baldereducation.sitecore.model.domain.to.StatisticTO;
import br.com.baldereducation.sitecore.service.StatisticsService;
import br.com.baldereducation.sitecore.util.rest.AbstracRestTemplate;

public class StatisticsServiceImpl extends AbstracRestTemplate implements StatisticsService {

	@Override
	public StatisticTO getStatistic() {
		StatisticTO statisticTO = getRestTemplate().getForObject(URL_APP_STATISTICS_GET_PROGRESSION, StatisticTO.class);

		return statisticTO;
	}

	@Override
	public StatisticTO postStatistic(StatisticTO statisticTO) {
		StatisticTO result = getRestTemplate().postForObject(URL_APP_STATISTICS_POST_PROGRESSION, statisticTO,
				StatisticTO.class);
		return result;
	}

}
