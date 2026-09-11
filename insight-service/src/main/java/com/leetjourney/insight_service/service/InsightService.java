package com.leetjourney.insight_service.service;

import com.leetjourney.insight_service.client.UsageClient;
import com.leetjourney.insight_service.dto.InsightDto;
import com.leetjourney.insight_service.dto.UsageDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class InsightService {

    private UsageClient usageClient;

    public InsightService(UsageClient usageClient) {
        this.usageClient = usageClient;
    }

    public InsightDto getOverview(Long userId) {
        // Fetch data from Usage Service
        final UsageDto usageData = usageClient.getXDaysUsageForUser(userId, 3);
    }
}
