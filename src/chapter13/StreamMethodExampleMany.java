package chapter13;

import java.util.*;
import java.util.stream.Collectors;

public class StreamMethodExampleMany {
    public static void main(String[] args) {
        int[] arr = {1,1,10,30,2};
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(10);
        list.add(30);
        list.add(2);

        // 숫자 배열 Stream 사용 시 여러 메소드를 쓰기 위한 boxed 처리
        System.out.println(Arrays.stream(arr).boxed());

        // count() 배열, 컬렉션 크기 확인
        System.out.println("count() 배열, 컬렉션 크기 확인");
        System.out.println(Arrays.stream(arr).count());
        System.out.println(list.stream().count());

        // sorted() 정렬
        System.out.println("sorted() 정렬");
        System.out.println(Arrays.stream(arr).boxed().sorted().collect(Collectors.toList()));
        System.out.println(list.stream().sorted().collect(Collectors.toList()));

        // sorted(Comparator.reverseOrder()) 역정렬
        System.out.println("sorted(Comparator.reverseOrder()) 역정렬");
        System.out.println(Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
        System.out.println(list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));

        // findFirst() 처음 값
        System.out.println("findFirst() 처음 값");
        System.out.println(Arrays.stream(arr).findFirst().getAsInt());
        System.out.println(list.stream().findFirst().get());

        // skip(배열크기 - 1).findFirst() 마지막 값
        System.out.println("skip(배열크기 - 1).findFirst()");
        System.out.println(Arrays.stream(arr).skip(arr.length - 1).findFirst().getAsInt());
        System.out.println(list.stream().skip(list.size() - 1).findFirst().get());

        // skip(값) N개 생략하고
        System.out.println("skip(값) N개 생략하고");
        System.out.println(Arrays.stream(arr).boxed().skip(1).collect(Collectors.toList()));
        System.out.println(list.stream().skip(1).collect(Collectors.toList()));

        // limit(값) N개 까지
        System.out.println("limit(값) N개 까지");
        System.out.println(Arrays.stream(arr).boxed().limit(2).collect(Collectors.toList()));
        System.out.println(list.stream().limit(2).collect(Collectors.toList()));

        // distinct() 중복 생략
        System.out.println("distinct() 중복 생략");
        System.out.println(Arrays.stream(arr).boxed().distinct().collect(Collectors.toList()));
        System.out.println(list.stream().distinct().collect(Collectors.toList()));

        // max(데이터타입::compare) 최대값
        System.out.println("max(데이터타입::compare) 최대값");
        System.out.println(Arrays.stream(arr).boxed().max(Integer::compare).get());
        System.out.println(list.stream().max(Integer::compare).get());

        // min(데이터타입::compare) 최소값
        System.out.println("min(데이터타입::compare) 최소값");
        System.out.println(Arrays.stream(arr).boxed().min(Integer::compare).get());
        System.out.println(list.stream().min(Integer::compare).get());

        // average() 평균
        System.out.println("average() 평균");
        System.out.println(Arrays.stream(arr).average().getAsDouble());
        System.out.println(list.stream().mapToDouble(Integer::doubleValue).average().getAsDouble());

        // sum() 합계
        System.out.println("sum() 합계");
        System.out.println(Arrays.stream(arr).sum());
        System.out.println(list.stream().mapToInt(Integer::intValue).sum());

        // 람다(Lambda)를 이용한 가공
        // map(값을 원하는대로 가공)
        System.out.println("map 1이면 true 아니면 false 예제");
        System.out.println(Arrays.stream(arr).boxed().map(val -> val == 1).collect(Collectors.toList()));
        System.out.println(list.stream().map(val -> val == 1).collect(Collectors.toList()));

        // map 값마다 10 더하기 예제
        System.out.println("map 값마다 10 더하기 예제");
        System.out.println(Arrays.stream(arr).boxed().map(val -> val = val + 10).collect(Collectors.toList()));
        System.out.println(list.stream().map(val -> val = val + 10).collect(Collectors.toList()));

        // map 값 반올림 예제
        System.out.println("map 값 반올림 예제");
        System.out.println(Arrays.stream(arr).boxed().map(val -> Math.round(val*10)/10.0).collect(Collectors.toList()));
        System.out.println(list.stream().map(val -> Math.round(val*10)/10.0).collect(Collectors.toList()));

        // forEach(모든 값마다 입력한 내용 수행)
        System.out.println("forEach(모든 값마다 입력한 내용 수행)");
        Arrays.stream(arr).boxed().forEach(val -> System.out.println("ForEach 출력! : " + val));
        list.stream().forEach(val -> System.out.println("ForEach 출력! : " + val));

        // anyMatch(스트림에서 조건이 하나라도 맞으면)
        System.out.println("anyMatch(스트림에서 조건이 하나라도 맞으면) TRUE");
        System.out.println(Arrays.stream(arr).anyMatch(val -> val == 1));
        System.out.println(list.stream().anyMatch(val -> val == 1));

        // noneMatch(스트림에서 조건이 하나도 안맞으면)
        System.out.println("noneMatch(스트림에서 조건이 하나도 안맞으면) TRUE");
        System.out.println(Arrays.stream(arr).noneMatch(val -> val == 99));
        System.out.println(list.stream().noneMatch(val -> val == 99));

        // allMatch(스트림의 값이 모두 조건과 맞아야)
        System.out.println("allMatch(스트림의 값이 모두 조건과 맞아야) TRUE");
        System.out.println(Arrays.stream(arr).allMatch(val -> val == 1));
        System.out.println(list.stream().allMatch(val -> val == 1));

        // filter (특정 값만 허용)
        System.out.println("filter (특정 값만 허용)");
        System.out.println(Arrays.stream(arr).boxed().filter(val -> val == 10).collect(Collectors.toList()));
        System.out.println(list.stream().filter(val -> val == 10).collect(Collectors.toList()));

        // reduce (스트림 값을 모두 하나로 합치기)
        System.out.println("reduce (스트림 값을 모두 하나로 합치기) 다 합치고 5 더하기 예제");
        System.out.println(Arrays.stream(arr).reduce(5, Integer::sum));
        System.out.println(list.stream().reduce(5, Integer::sum));
    }
}
