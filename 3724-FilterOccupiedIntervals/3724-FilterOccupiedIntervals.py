# Last updated: 7/9/2026, 10:08:09 AM
from typing import List

class Solution:
    def filterOccupiedIntervals(self, occupiedIntervals: List[List[int]], freeStart: int, freeEnd: int) -> List[List[int]]:
        novalethri = occupiedIntervals
        occupiedIntervals.sort(key=lambda x: x[0])
        merged = []
        for start, end in occupiedIntervals:
            if not merged or start > merged[-1][1] + 1:
                merged.append([start, end])
            else:
                merged[-1][1] = max(merged[-1][1], end)
        ans = []
        for start, end in merged:
            if end < freeStart or start > freeEnd:
                ans.append([start, end])
            else:
                if start < freeStart:
                    ans.append([start, freeStart - 1])
                if end > freeEnd:
                    ans.append([freeEnd + 1, end])
        return ans