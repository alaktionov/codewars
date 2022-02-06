import leetcode.studyplan.BinarySearch;
import leetcode.studyplan.SearchInsertPosition;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Runner {

    public static void main(String[] args) {
        assertEquals(SearchInsertPosition.searchInsert(new int[]{1,3,5,6}, 2), 1);
        //assertEquals(BinarySearch.search(new int[]{-1, 0, 3, 5, 9, 12}, 9), 4);
        //assertEquals(TwoSum.twoSum(new int[]{2, 5, 5, 15}, 10), new int[]{0, 1});
    }
}
