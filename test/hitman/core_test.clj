(ns hitman.core-test
  (:use clojure.test
        hitman.core))

(deftest oneliner-test
  (testing "it parses oneline text correctly"
    (is (= "<p>Hitman</p>"                (markdown-to-html "Hitman")))
    (is (= "<p>Hitman Agent.47</p>"       (markdown-to-html "Hitman Agent.47")))
    (is (= "<p>  Hitman Agent.47</p>"     (markdown-to-html "  Hitman Agent.47")))
    (is (= "<p>\tHitman Agent.47</p>"     (markdown-to-html "\tHitman Agent.47")))
    (is (= "<p> Hitman Agent.47 </p>" (markdown-to-html " Hitman Agent.47 \n\n")))

    )
  (testing "it parses oneline text with span elements correctly"
    (is (= "<p><strong>Hitman</strong></p>" (markdown-to-html "**Hitman**"))))
  (testing "it parses rules correctly"
    (is (= "<p>Hitman</p>" (markdown-to-html "Hitman\n\n")))))
