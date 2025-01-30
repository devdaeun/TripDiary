// 카테고리에 따라 Q&A 항목을 필터링하는 함수
function filterQnaByCategory(category) {
    var qnaItems = document.querySelectorAll('.qnaitem');

    // 모든 Q&A 항목을 숨깁니다
    qnaItems.forEach(function(item) {
        item.style.display = 'none';
    });

    // 선택한 카테고리에 맞는 항목만 표시합니다
    qnaItems.forEach(function(item) {
        var itemCategory = item.querySelector('.category').textContent.trim();
        if (category === '' || itemCategory === category) {
            item.style.display = 'block';
        }
    });
}