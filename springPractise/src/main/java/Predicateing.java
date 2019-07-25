/*
public class Predicateing {

    */
/*private void bingStatus(LineDetails line, AssignedProduct assignedProduct) {*//*


        */
/*Optional.ofNullable(assignedProduct)
                .map(AssignedProduct::getProductOffering)
                .map(ProductOffering::getProductSpecification)
                .orElseGet(Collections::emptyList)
                .stream()
                .filter(bingOnPredicate())
                .findFirst()
                .map(ProductSpecificationBase::getProductClassification)
                .orElseGet(Collections::emptyList)
                .stream()
                .flatMap(productClassification -> productClassification.getClassificationAttribute()
                        .stream())
                .filter(getSpecificationValuePredicate())
                .findFirst()
                .ifPresent(specificationValue -> line.setBingeOnStatus(BING_STATUS_ON));*//*

    }


    */
/**
     * API 2040 - customerAccountLineBillingDetails
     * bingOnPredicate
     *
     * @return
     *//*

*/
/*    private Predicate<ProductSpecificationBase> bingOnPredicate() {

        return f -> BINGE_ON_ID.equalsIgnoreCase(f.getProductSpecificationId());
    }*//*




}a?
*/
