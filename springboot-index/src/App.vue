<template>
  <el-container class="is-vertical">
    <comment-header/>
    <home-index/>
    <comment-footer/>
  </el-container>
</template>

<script>
import CommentHeader from './components/Header/header.vue'
import CommentFooter from './components/Footer/footer.vue'
import HomeIndex from './pages/Home/index.vue'
export default {

  components: {
    CommentHeader,
    CommentFooter,
    HomeIndex
  }
}
</script>

<style lang="stylus" rel="stylesheet/stylus">
</style>
