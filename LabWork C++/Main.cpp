#include <iostream>
#include <queue>
#include <vector>
#include <algorithm>
using namespace std;

int getMin(priority_queue<int> heap) {
	if (heap.empty()) {
		throw runtime_error("Heap is empty");
	}
	int min_el = INT_MAX;
	while (!heap.empty()) {
		min_el = min(min_el, heap.top());
		heap.pop();
	}
	return min_el;
}

int main() {
	setlocale(LC_ALL, "");
	priority_queue<int> maxHeap;
	maxHeap.push(5);
	maxHeap.push(2);
	maxHeap.push(10);
	maxHeap.push(1);
	//Задание 1
	cout << "Max элемент кучи: " << maxHeap.top() << endl;
	cout << "Размер кучи: " << maxHeap.size() << endl;

	//Задание 2
	// Встроенной функции для нахождения минимума из подобной кучи нету и у нас есть несколко вариантов:
	// 1) сформировать вторую кучу (с данными из первой)
	// priority_queue<int, vector<int>, greater<int>> minHeap (корень = минимальный эл-т)
	// 2) Написать функцию которая переберёт все эл-ты кучи и найдёт минимальный
	// 3) Написать самостоятельно новый класс maxHeap, где описать все нужные функции и уже через 
	// него создать кучу (самый мыторный способ, за то можно придумать и описать любую функцию)
	cout << "Min элемент кучи: " << getMin(maxHeap) << endl; // Я выбрал 2-ой способ (функция вверху кода)

	return 0;
}

